(ns hello-time
  (:require [clj-time.core :as t]
            [clj-time.format :as f]))

(defn now
  "returns the current date time"
  []
  (t/now))


(defn time-str
  "Returns a string representation of a datetime in the local time zone."
  [dt]
  (f/unparse
    (f/with-zone (f/formatter "hh:mm aa") (t/default-time-zone))
    dt))

