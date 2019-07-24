var application = require("application");
var context = application.android.context;

module.exports = {
  showToast: function() {
    // var toaster = new org.nativescript.kstanoev.toaster.Toaster();
    var toaster = new mg.madaapps.plugin_nativescript.Toaster();
    toaster.show(context);
  }
};
