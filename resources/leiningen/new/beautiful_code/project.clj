(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v20.html"}
  :depenencies [[org.clojure/clojure "1.9.0"]]
  :plugins [[lein-kibit "0.1.5"]
            [jonase/eastwood "0.2.5"]
            [lein-cloverage "1.0.10"]
            [lein-codox "0.10.3"]]
  :codox {:output-path "doc"})
