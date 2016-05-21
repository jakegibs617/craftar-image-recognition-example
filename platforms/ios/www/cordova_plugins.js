cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
    {
        "file": "plugins/com.catchoom.craftar/www/CraftARError.js",
        "id": "com.catchoom.craftar.CraftARError",
        "pluginId": "com.catchoom.craftar",
        "clobbers": [
            "CraftARError"
        ]
    },
    {
        "file": "plugins/com.catchoom.craftar/www/CraftARSDK.js",
        "id": "com.catchoom.craftar.CraftARSDK",
        "pluginId": "com.catchoom.craftar",
        "clobbers": [
            "CraftARSDK"
        ]
    },
    {
        "file": "plugins/com.catchoom.craftar/www/CraftARCloudRecognition.js",
        "id": "com.catchoom.craftar.CraftARCloudRecognition",
        "pluginId": "com.catchoom.craftar",
        "clobbers": [
            "CraftARCloudRecognition"
        ]
    }
];
module.exports.metadata = 
// TOP OF METADATA
{
    "cordova-plugin-whitelist": "1.2.1",
    "com.catchoom.craftar": "2.0.0"
}
// BOTTOM OF METADATA
});