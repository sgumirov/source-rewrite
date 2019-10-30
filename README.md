A proof-of-concept of using Antlr 4 as source rewriter
======================================================

Task: rewrite anonymous functions as named ones and change return type in
Typescript source code.

This is a concept, just to refresh my knowledge of Antlr and automate
a routinous work task.

For example:
```export const FormRadios: React.FC<RadiosProps> = ({
  options,
  onChange,
  value,
  name,
  disabled = false
}) => {```

=>

```export function FormRadios({
  options,
  onChange,
  value,
  name,
  disabled = false
}: RadiosProps): JSX.Element {```

Note: function return type is hardcoded (the reason is out of scope of this project).
