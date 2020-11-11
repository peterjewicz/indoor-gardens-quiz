(ns indoor-garden-quiz.core-test
    (:require
     [cljs.test :refer-macros [deftest is testing]]
     [indoor-garden-quiz.components.progress :refer [PROGRESS-WIDTH set-progress-width]]))


(deftest progress-test
  (is (= (set-progress-width 4 1) 50)))

(deftest progress-test-2
  (is (= (set-progress-width 4 3) 150)))

