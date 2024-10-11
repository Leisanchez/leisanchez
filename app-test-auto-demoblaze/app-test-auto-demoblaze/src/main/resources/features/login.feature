@Suite @Login
Feature: CP01-Realizar el registro de un nuevo usuario
  Background: realizar el registro de un nuevo usuario con caso acertado y caso errado
    Given El usuario navega al sitio

	@ValidateCredentials
    Scenario: 1- Registro de nuevo usuario correcto
      When ingresa un usuario nuevo en la opción sign up
      Then la pagina muestra mensaje de creación correcto
      
    Given El usuario realiza la compra efectiva
    
    @EffectivePurchase
    Scenario: 1- compra efectiva de telefono
      When selecciona la categoria telefono y la marca
      Then lo agrega al cart y genera la orden de compra