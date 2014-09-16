package ajaxdependancyselection

class Country {

    String name
    static hasMany = [cities : City]
}
