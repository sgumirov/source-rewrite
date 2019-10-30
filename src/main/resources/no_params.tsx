import React from "react"
import { BrowserHeaders } from "browser-headers"
import { useHistory } from "react-router"

import {
  IdentityVerificationApiClient,
  SubmitRequest,
  SubmitResponse,
  ServiceError,
  VerifyRequest
} from "src/utils/ApiClients"
import {
  UserApiClient,
  MeRequest,
  MeResponse,
  ServiceError as UserServiceError
} from "src/utils/ApiClients/User"
import { UserContext } from "src/contexts/UserContext"

import { Button } from "src/components/FormUtils/Button"

import "./profile.scss"

export const KYCUpdateForm: React.FC = () => {
  const { User, UserActions } = React.useContext(UserContext)

  const [user] = React.useState(User.apiUser)
  const [currentStep, setCurrentStep] = React.useState(2)
  const [isLoading, setIsLoading] = React.useState(false)
  const [idNowResponse, setIDNowResponse] = React.useState<
    SubmitResponse.AsObject
  >()

  const history = useHistory()

  const isFormValid = (): boolean => {
    if (!userKYCInfo.title) return false

    return true
  }

  return (
    <div className="form form--overlay">
      <div className="container">
        <div className="update-profile">
          <div className="form-wrapper">
            <KYCSteps currentStep={currentStep} />
            {renderStep(currentStep)}
          </div>
        </div>
      </div>
    </div>
  )
}
