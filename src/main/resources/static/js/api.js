api = (function () {
    return {
        connectCasesBycountry: function (city, callback) {
            var promiseGetAllCases = $.getJSON(`/cases/{country}`);
            $.when(promiseGetAllCases).done(function (data) {
                callback(data);
            })
        }
    }
})();