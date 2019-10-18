(ns crux.crux-helpers
  (:require [crux.api :as api]))


(defn tx-log [node & [from-tx-id]]
  (api/tx-log node (api/new-tx-log-context node) from-tx-id true))


(defn latest-tx-id [crux-node]
  (-> crux-node tx-log last :crux.tx/tx-id))
