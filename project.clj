(def base-version "1.0")

(def build-version "1.0.4")

(defproject net.clojars.uswitch-service/mississippi build-version
  :description "validations for clojure maps"
  :url "https://github.com/uswitch/mississippi"
  :license {:name "Eclipse"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :plugins [[s3-wagon-private "1.3.4"]]
  :repositories {"clojars"
                 {:sign-releases false
                  :no-auth false}
                 "github"    {:url           "https://maven.pkg.github.com/uswitch/mississippi"
                              :username      :env/GITHUB_ACTOR
                              :password      :env/GITHUB_TOKEN
                              :sign-releases false}}
  :lein-release {:deploy-via "github"})
