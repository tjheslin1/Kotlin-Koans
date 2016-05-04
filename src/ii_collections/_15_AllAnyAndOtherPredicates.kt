package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

fun Customer.isFrom(city: City): Boolean {
    todoCollectionTask()
}

fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    todoCollectionTask()
}

fun Shop.hasCustomerFrom(city: City): Boolean {
    todoCollectionTask()
}

fun Shop.countCustomersFrom(city: City): Int {
    todoCollectionTask()
}

fun Shop.findAnyCustomerFrom(city: City): Customer? {
    todoCollectionTask()
}
