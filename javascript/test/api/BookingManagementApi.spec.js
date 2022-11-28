/**
 * Lite API
 * lite api hotel booking api
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function (root, factory) {
  if (typeof define === "function" && define.amd) {
    // AMD.
    define(["expect.js", process.cwd() + "/src/index"], factory);
  } else if (typeof module === "object" && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require("expect.js"), require(process.cwd() + "/src/index"));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.LiteApi);
  }
})(this, function (expect, LiteApi) {
  "use strict";

  var instance;

  beforeEach(function () {
    instance = new LiteApi.BookingManagementApi();
  });

  var getProperty = function (object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === "function") return object[getter]();
    else return object[property];
  };

  var setProperty = function (object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === "function") object[setter](value);
    else object[property] = value;
  };

  describe("BookingManagementApi", function () {
    // describe('bookingsBookingIdDelete', function() {
    //   it('should call bookingsBookingIdDelete successfully', function(done) {
    //     //uncomment below and update the code to test bookingsBookingIdDelete
    //     //instance.bookingsBookingIdDelete(function(error) {
    //     //  if (error) throw error;
    //     //expect().to.be();
    //     //});
    //     done();
    //   });
    // });
    // describe('bookingsBookingIdGet', function() {
    //   it('should call bookingsBookingIdGet successfully', function(done) {
    //     //uncomment below and update the code to test bookingsBookingIdGet
    //     //instance.bookingsBookingIdGet(function(error) {
    //     //  if (error) throw error;
    //     //expect().to.be();
    //     //});
    //     done();
    //   });
    // });
  });
});
