if (typeof jQuery !== 'undefined') {
	(function($) {
		$('#spinner').ajaxStart(function() {
			$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		});
	})(jQuery);
}


/*
 $(document).ready(function() {
 $.ajax({
 type: "GET",
 url: '/ViajeroPlus/ciudad/ajaxBuscadorCuidades',
 success : function(response) {

 $('#ciudadDestino').autocomplete({
 source: response
 });

 $('#ciudadOrigen').autocomplete({
 source: response
 });
 }
 });

 });
 */
//window.location.hash="no-back-button";
//window.location.hash="Again-No-back-button";//again because google chrome don't insert first hash into history
//window.onhashchange=function(){window.location.hash="no-back-button";}
