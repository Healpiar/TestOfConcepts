package ajaxdependancyselection

import grails.converters.JSON

class ContinentController {

    def listContinent() {
        def primarySelectList = []
        def primaryMap = [:]
        primaryMap.put('id', '')
        primaryMap.put('name', 'Select Country')
        primarySelectList.add(primaryMap)
        Continent.get(1).each {
            primaryMap = [:]
            primaryMap.put('id', it.id)
            primaryMap.put('name', it.name)
            primarySelectList.add(primaryMap)
        }
        render primarySelectList as JSON
    }
}
