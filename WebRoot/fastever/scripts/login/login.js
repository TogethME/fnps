//post
$.ajax({
            url: "api/v1/allCustomerBooms",
            type: "POST",
            contentType: "text/json",
            asnyc: "false",
            data: '{"str":"Invoke Test"}',
            dataType: 'application/json',
            success: function (resultObj) {
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
            }
        });

//get
var queryAllCustomerBooms = $.ajax({
    url: "api/v1/allCustomerBooms",
    type: "Get",
    asnyc: false,
    dataType: 'application/json',
    success: function (resultObj) {
    	alert("success");
    	},
    error: function (XMLHttpRequest, textStatus, errorThrown) {
    }
});