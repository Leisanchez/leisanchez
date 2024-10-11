package com.demo.test.main;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "./src/main/resources/features", glue="com.demo.test.main", tags="@EffectivePurchase")

class Runner {

}
