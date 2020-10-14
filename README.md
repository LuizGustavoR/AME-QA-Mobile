### AME - Quality Assurance | Challenge – Mobile

* Instale o node.js:\
https://nodejs.org/en/download/
* Instale o appium:\
`npm install -g appium`

* ANDROID_HOME variável de ambiente:\
`D:\Android\sdk`

* Criar um device android virtual pelo android studio:\
Android versão: "10.0"\
Nome do device: "Pixel_2_API_28_Pie"

* Iniciar o device virtual
* Iniciar o appium pelo terminal:\
`appium`

* Importar como projeto maven (pelo intelij).
* Na raiz do projeto executar o seguinte comando maven \
```..\AME-QA-Mobile>mvn verify```
* Esse comando irá rodar os testes e criar o seguinte relatório: \
```target\cucumber-html-reports\overview-features.html```
* Obs: Para visualisar o relatório abra a página em um navegador.