package com.example.navcomponents

object CatsProvider {

    private val catModelData: ArrayList<CatsModel> = ArrayList()
    fun getListCatError(): ArrayList<CatsModel> {
        dataCats("100");dataCats("101");dataCats("102");dataCats("200")
        dataCats("201");dataCats("202");dataCats("203");dataCats("204")
        dataCats("206");dataCats("207")
        dataCats("300");dataCats("301");dataCats("302");dataCats("303")
        dataCats("304");dataCats("305");dataCats("307");dataCats("308")
        dataCats("400");dataCats("401");dataCats("402");dataCats("403")
        dataCats("404");dataCats("405");dataCats("406");dataCats("407")
        dataCats("408");dataCats("409");dataCats("410");dataCats("411")
        dataCats("412");dataCats("413");dataCats("414");dataCats("415")
        dataCats("416");dataCats("417");dataCats("418");dataCats("420")
        dataCats("421");dataCats("422");dataCats("423");dataCats("424")
        dataCats("425");dataCats("426");dataCats("429");dataCats("431")
        dataCats("444");dataCats("450");dataCats("451");dataCats("497")
        dataCats("498");dataCats("499");dataCats("500");dataCats("502")
        dataCats("503");dataCats("504");dataCats("506");dataCats("507")
        dataCats("508");dataCats("509");dataCats("510");dataCats("508")
        dataCats("509");dataCats("510");dataCats("508");dataCats("509")
        dataCats("510");dataCats("511");dataCats("521");dataCats("522")
        dataCats("523");dataCats("525");dataCats("599")
        return catModelData
    }

    private fun dataCats(name: String) {
        catModelData.add(CatsModel(name, "https://http.cat/$name"))
    }
}