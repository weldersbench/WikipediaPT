$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Funcionalidade"
});
formatter.before({
  "duration": 44253566626,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Consultar Ovo de Pascoa",
  "description": "",
  "id": "consulta;consultar-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 4,
  "name": "que acesso a Wikipedia em Portugues",
  "keyword": "Dado "
});
formatter.step({
  "line": 5,
  "name": "pesquiso por \"Ovo de Páscoa\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 6,
  "name": "Exibe a expresao \"Ovo de Páscoa\" no titulo da guia",
  "keyword": "Entao "
});
formatter.match({
  "location": "Post.queAcessoAWikipediaEmPortugues()"
});
formatter.result({
  "duration": 16558049070,
  "status": "passed"
});
});