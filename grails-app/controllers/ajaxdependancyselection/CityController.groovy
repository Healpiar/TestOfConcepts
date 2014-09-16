package ajaxdependancyselection

import grails.converters.JSON

class CityController {

    def listCity() {
        def primarySelectList = []
        def primaryMap = [:]
        primaryMap.put('id', '')
        primaryMap.put('name', 'Select City')
        primarySelectList.add(primaryMap)
        City.get(1).each {
            primaryMap = [:]
            primaryMap.put('id', it.id)
            primaryMap.put('name', it.name)
            primarySelectList.add(primaryMap)
        }
        render primarySelectList as JSON
    }
}
