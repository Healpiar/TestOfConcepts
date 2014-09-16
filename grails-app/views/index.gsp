<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main2"/>
    <title>Welcome to Grails</title>
</head>
<body>

<div id="page-body" role="main">

    <div id="controller-list" role="navigation">
        <h2>AjaxDependancySelection</h2>

        <div class="form-group">
            <g:selectPrimary class="form-control" required="required" id="continent" name="continent"

                             domain='ajaxdependancyselection.Continent'
                             searchField='name'
                             collectField='id'

                             controller="Country"
                             action="listCountry"

                             domain2='ajaxdependancyselection.Country'
                             bindid="continent.id"
                             searchField2='name'
                             collectField2='id'

                             noSelection="['': 'Select Continet']"
                             setId="country"
                             value=''/>
        </div>

        <div class="form-group">
            <g:select class="form-control" name="country" id="country"  from="[]" noSelection="['': 'Select Country']" />
        </div>

    </div>
</div>
<g:javascript library="jquery_ui"/>
</body>
</html>
