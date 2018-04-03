(ns leiningen.new.beautiful-code
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files year]]
            [leiningen.core.main :as main]))

(def render (renderer "beautiful-code"))

(defn beautiful-code
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :year (year)}]
    (main/info "Generating fresh 'lein new' beautiful-code project.")
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["test/{{sanitized}}/core_test.clj" (render "core_test.clj" data)]
             ["CHANGELOG.md" (render "CHANGELOG.md")]
             ["README.md" (render "README.md" data)]
             ["LICENSE" (render "LICENSE")]
             "resources"
             "doc")))

