;; Copyright © 2014 JUXT LTD.

(defproject juxt.modular/mqtt "0.1.0-SNAPSHOT"
  :description "A modular extension that provides support for MQTT over Netty"
  :url "https://github.com/juxt/modular/tree/master/modules/mqtt"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[com.stuartsierra/component "0.2.1"]
                 [prismatic/schema "0.2.1"]
                 [juxt/clj-mqtt "0.4.6-alpha"]
                 [juxt.modular/netty "0.1.0-SNAPSHOT"]])
