# Using Kotlin Coroutines in your Android app

This folder contains the source code for the [Kotlin Coroutines codelab](https://codelabs.developers.google.com/codelabs/kotlin-coroutines/index.html).

## License

    Copyright 2018 Google LLC

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        https://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

video: https://youtu.be/x1Awg3SlPh8

Ventajas de usar corrutinas vs Callbacks  

Las corrutinas permiten escribir código asíncrono que parece sincrónico. Esto hace que el código sea más fácil de leer y entender, ya que evita el "callback hell" (anidación profunda de callbacks).

El manejo de errores con corrutinas es más directo y se asemeja al manejo de errores en código sincrónico. Con callbacks, el manejo de errores puede volverse complejo, especialmente cuando se tienen múltiples fuentes de callbacks.

Muchas librerías modernas para Android ofrecen soporte nativo para corrutinas, facilitando su uso e integración.
