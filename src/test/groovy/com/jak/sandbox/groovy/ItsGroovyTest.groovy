package com.jak.sandbox.groovy

import spock.lang.Specification

class ItsGroovyTest extends Specification {
    def "one plus one should equal two"() {
        given:
            int num1 = 1
            int num2 = 1

        when:
            int result = new ItsGroovy().addTwo(num1, num2)

        then:
            result == 2
    }
}
