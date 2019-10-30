import React from "react"

interface RadiosProps {
  options: Array<RadioOption>
  onChange: Function
  value: string
  name: string
  disabled?: boolean
}

interface RadioOption {
  label: string
  value: string
}

export const FormRadios: React.FC<RadiosProps> = ({
  options,
  onChange,
  value,
  name,
  disabled = false
}) => {
  const handleClick = (
    event: React.MouseEvent<HTMLElement> | React.ChangeEvent<HTMLElement>,
    value: string
  ): void => {
    event.stopPropagation()
    event.preventDefault()
    onChange(value)
  }

  return (
    <div className="input-row input-row--radio">
      {options.map(option => {
        return (
          <label
            key={option.value}
            className="input-row__label"
            onClick={event => handleClick(event, option.value)}
          >
            <input
              type="radio"
              name={name}
              className="input-row__input-field"
              value={option.value}
              checked={option.value === value}
              onChange={event => handleClick(event, option.value)}
              disabled={disabled}
            />
            <span className="input-row__label-text">{option.label}</span>
            <span className="checkmark" />
          </label>
        )
      })}
    </div>
  )
}
