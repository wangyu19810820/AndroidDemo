fun main() {
    var mutableMap = mutableMapOf<String, Int>("Jack" to 20, "Jason" to 18)
    mutableMap += "Jimmy" to 30
    mutableMap.put("Jimmy", 31)
    mutableMap.getOrPut("Rose"){18}
    println(mutableMap)
}