enum class LootType {
    WEAPON, ARMOR, OBJECT
}
class Loot(val name: String, val LootType: LootType, val value: Double) {

}