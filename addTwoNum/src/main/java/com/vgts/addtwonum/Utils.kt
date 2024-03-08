package com.vgts.addtwonum

data class Numbers(val a: Double, val b: Double) {
    fun addTwoNum(): Double {
        return this.a + this.b
    }
}
