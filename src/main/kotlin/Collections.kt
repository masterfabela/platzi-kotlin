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

    fun orderLists() {
        val lotteryNumbers = listOf(11, 22, 43, 56, 78, 66)
        val sortedNumbers = lotteryNumbers.sorted()
        println(sortedNumbers)

        val sortedDescendingNumbers = lotteryNumbers.sortedDescending()
        println(sortedDescendingNumbers)

        val orderByMultiply = lotteryNumbers.sortedBy { number -> number < 50 }
        println(orderByMultiply)

        val randomNumbers = lotteryNumbers.shuffled()
        println(randomNumbers)

        val reverseNumbers = lotteryNumbers.reversed()
        println(reverseNumbers)

        val numberMessages = lotteryNumbers.map { number -> "Tu numero de loteria es $number" }
        println(numberMessages)

        val filterNumbers = lotteryNumbers.filter { number -> number > 50 }
        println(filterNumbers)
    }

    fun maps() {
        val superHeroesAge = mapOf(
            "IronMan" to 35,
            "Spiderman" to 23,
            "Capitan America" to 99
        )
        println(superHeroesAge)

        val superHeroesAgeMutable = mutableMapOf(
            "IronMan" to 35,
            "Spiderman" to 23,
            "Capitan America" to 99
        )
        println(superHeroesAgeMutable)
        superHeroesAgeMutable.put("Wolverine", 45)
        println(superHeroesAgeMutable)
        superHeroesAgeMutable["Storm"] = 30
        println(superHeroesAgeMutable)

        val ironmanAge = superHeroesAgeMutable["IronMan"]
        println(ironmanAge)

        superHeroesAgeMutable.remove("Wolverine")
        println(superHeroesAgeMutable)

        println(superHeroesAgeMutable.keys)
    }
}