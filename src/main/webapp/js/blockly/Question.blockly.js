window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Question = window.blockly.js.blockly.Question || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Question.incrementoArgs = [];
window.blockly.js.blockly.Question.incremento = async function() {
 var numero;
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getScopeVariable('alternativas'))) {
    await this.blockly.js.blockly.Question.defScopeVar();
  }
  numero = this.cronapi.screen.getScopeVariable('alternativas');
  if ((numero + 1) <= 10) {
    this.cronapi.screen.createScopeVariable('alternativas', (numero + 1));
  }
  this.cronapi.util.setCookie('qtdAlternativas', this.cronapi.screen.getScopeVariable('alternativas'), 'hours', 1);
  await this.blockly.js.blockly.Question.loadAlts();
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Question.defScopeVarArgs = [];
window.blockly.js.blockly.Question.defScopeVar = async function() {
 var numero;
  this.cronapi.screen.createScopeVariable('alternativas', 2);
  await this.blockly.js.blockly.Question.loadAlts();
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Question.resetScopeArgs = [];
window.blockly.js.blockly.Question.resetScope = async function() {
 var numero;
  this.cronapi.screen.createScopeVariable('alternativas', 2);
  await this.blockly.js.blockly.Question.loadAlts();
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Question.decrementoArgs = [];
window.blockly.js.blockly.Question.decremento = async function() {
 var numero;
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getScopeVariable('alternativas'))) {
    await this.blockly.js.blockly.Question.defScopeVar();
  }
  numero = this.cronapi.screen.getScopeVariable('alternativas');
  if ((numero - 1) >= 2) {
    this.cronapi.screen.createScopeVariable('alternativas', (numero - 1));
  }
  this.cronapi.util.setCookie('qtdAlternativas', this.cronapi.screen.getScopeVariable('alternativas'), 'hours', 1);
  await this.blockly.js.blockly.Question.loadAlts();
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Question.loadAltsArgs = [];
window.blockly.js.blockly.Question.loadAlts = async function() {
 var numero;
  if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getScopeVariable('alternativas'))) {
    await this.blockly.js.blockly.Question.defScopeVar();
  }
  for (i = 1; i <= 10; i++) {
    if (i <= this.cronapi.screen.getScopeVariable('alternativas')) {
      this.cronapi.screen.showComponent(String('inputAlt') + String(i));
    } else {
      this.cronapi.screen.hideComponent(String('inputAlt') + String(i));
    }
  }
}
