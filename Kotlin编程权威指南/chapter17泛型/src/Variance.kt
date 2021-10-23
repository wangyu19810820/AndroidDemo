class Barrel<out T>(val item: T)
class Barrel2<in T>(item: T)

fun main() {
    var fedoraBarrel: Barrel<Fedora> = Barrel(Fedora("a generic-looking fedora", 15))
    var lootBarrel: Barrel<Loot> = Barrel(Coin(15))

    lootBarrel = fedoraBarrel
    val myFedora: Fedora = lootBarrel.item

    var fedoraBarrel2: Barrel2<Fedora> = Barrel2(Fedora("a generic-looking fedora", 15))
    var lootBarrel2: Barrel2<Loot> = Barrel2(Coin(15))
    fedoraBarrel2 = lootBarrel2
}