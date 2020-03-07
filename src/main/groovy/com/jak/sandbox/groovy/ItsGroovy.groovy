package com.jak.sandbox.groovy

class ItsGroovy {
    def addTwo(def num1, num2) {
        return num1 + num2
    }

    static void main(String[] args) {
        print(new ItsGroovy().addTwo(3, 4))
    }
}
