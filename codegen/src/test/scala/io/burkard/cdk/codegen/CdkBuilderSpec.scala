package io.burkard.cdk.codegen

import org.scalatest.OptionValues
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers

class CdkBuilderSpec extends AnyFlatSpec with Matchers with OptionValues {
  import CdkBuilderTestFixtures.Valid._

  it should "support a builder using `create` with context and ID" in {
    CdkBuilder
      .build(contextAndIdServiceName, contextAndIdBuilderClass)
      .value mustBe contextAndIdCdkBuilder
  }

  it should "support a builder using `create` with parameters" in {
    CdkBuilder
      .build(createParametersServiceName, createParametersBuilderClass)
      .value mustBe createParametersCdkBuilder
  }

  it should "support a builder using `create` without parameters" in {
    CdkBuilder
      .build(createNoParametersServiceName, createNoParametersBuilderClass)
      .value mustBe createNoParametersCdkBuilder
  }

  it should "support a builder using a direct constructor without parameters" in {
    CdkBuilder
      .build(directConstructorServiceName, directConstructorBuilderClass)
      .value mustBe directConstructorCdkBuilder
  }

  it should "identify required fields from props" in {
    CdkBuilder
      .build(requiredFieldsPropsServiceName, requiredFieldsPropsBuilderClass)
      .value
      .requiredFieldNames mustBe requiredFieldsPropsNames
  }

  it should "identify required fields from interface" in {
    CdkBuilder
      .build(requiredFieldsInterfaceServiceName, requiredFieldsInterfaceBuilderClass)
      .value
      .requiredFieldNames mustBe requiredFieldsInterfaceNames
  }

  it should "reject a non-builder class" in {
    import CdkBuilderTestFixtures.Invalid._

    CdkBuilder.build(invalidServiceName, invalidClass) mustBe None
  }
}
