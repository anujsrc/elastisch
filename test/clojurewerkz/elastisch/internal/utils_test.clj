(ns clojurewerkz.elastisch.internal.utils-test
  (:require [clojurewerkz.elastisch.rest.utils :as utils])
  (:use clojure.test))

(deftest join-names-test
  (is (= "name" (utils/join-names "name")))
  (is (= "name1,name2" (utils/join-names ["name1", "name2"]))))
