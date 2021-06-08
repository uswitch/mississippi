(def base-version "1.0")

(def build-version (str base-version (if-let [number (System/getenv "DRONE_BUILD_NUMBER")]  (str "." number) "-SNAPSHOT")))

(defproject uswitch/mississippi build-version
  :description "validations for clojure maps"
  :url "https://github.com/uswitch/mississippi"
  :license {:name "Eclipse"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :plugins [[s3-wagon-private "1.3.4"]]
  :repositories {"s3-releases"
                 {:url           "s3p://uswitch-internal-jars/releases"
                  :sign-releases false
                  :no-auth true
                  }
                 "s3-snapshots"
                 {:url  "s3p://uswitch-internal-jars/snapshots"
                  :sign-releases false
                  :no-auth true
                  }
                 }
  :lein-release {:deploy-via "s3-releases"})
