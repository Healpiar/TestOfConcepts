package ajaxdependancyselection

class Continent {

    String name
    static hasMany = [countries : Country]
}
