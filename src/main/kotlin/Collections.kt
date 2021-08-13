class Collections {
    fun lists() {
        val namesList = listOf("Juan", "Enrrique", "Camila")
        println(namesList)

        val voidList = mutableListOf<String>()
        println(voidList)
        voidList.add("Juan")
        println(voidList)

        val usingGetValue = voidList.get(0)
        println(usingGetValue)

        val usingOperatorValue = voidList[0]
        println(usingOperatorValue)

        val firstValue = namesList.firstOrNull()
        println(firstValue)

        voidList.removeAt(0)
        println(voidList)

        voidList.add("Daniel")
        voidList.add("Lua")
        voidList.removeIf { item -> item.length > 3 }
        println(voidList)
    }

    fun array() {
        val myArray = arrayOf(1, 2, 3, 4)
        println(myArray.toList())
    }
}