import ajaxdependancyselection.City
import ajaxdependancyselection.Continent
import ajaxdependancyselection.Country

class BootStrap {

    def init = { servletContext ->

        //for(int i = 0; i< 50; i++) new Person(nombre : "Pedro").save()

        Continent america = new Continent(name : "America")
        Continent asia = new Continent(name : "Asia")
        Continent europe = new Continent(name : "Europe")


        Country colombia = new Country (name : "Colombia")
        Country brasil = new Country (name : "Brasil")
        Country china = new Country (name : "China")
        Country france = new Country (name : "France")


        City medellin = new City(name : "Medellin")
        City curitiba = new City(name : "Curitiba")
        City pekin = new City(name : "Pekin")
        City paris = new City(name : "Paris")

        colombia.addToCities(medellin)
        brasil.addToCities(curitiba)
        china.addToCities(pekin)
        france.addToCities(paris)

        america.addToCountries(colombia)
        america.addToCountries(brasil)
        asia.addToCountries(china)
        europe.addToCountries(france)

        america.save()
        asia.save()
        europe.save()
    }

    def destroy = {
    }
}
