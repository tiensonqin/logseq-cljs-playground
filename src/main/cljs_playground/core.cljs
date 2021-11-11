(ns cljs-playground.core)

(defn main []
  (js/logseq.App.showMsg "Hello from Clojure!"))

(defn init []
  (-> (js/logseq.ready main)
      (.catch js/console.error)))
