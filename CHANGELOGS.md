# Logs

## Initial Commit

Contains remix project created with `npx create-remix@latest` and minimalist
setup of shadow-cljs to create route component with clojurescript
(`routes/index` in this example).

## ShadowCLJS + Snowpack

The 2nd commits contains minimalist snowpack setup and necessary files that
allowed us watch the `:esm` target build and connect the cljs repl. This give us
automatic full reload on every file save as well as eval within the repl.
Basically things works as expected.

TLDR; 

Install snowpack via npm and modify `snowpack.config.js`. In this setup, we
mount (mapping) `shadow-public` directory to be served as `/` by the snowpack
development server.

Create build config in `shadow-cljs.edn`, the `:web` builds configuration is: 

```clojure
{
  ,,,
  :builds { ,,,
            :web {:target :esm
                  :output-dir "shadow-public/js"
                  :asset-path "/js"
                  :modules    {:main {:init-fn gemini.app/init}}
                  :js-options {:js-provider :import}}
                  
  }
}
```

Then: 

```
npx shadow-cljs watch :web   # or use the shadow-cljs dashboard as i do
npx snowpack dev # leave this running
```

Every file save will trigger snowpack to reload. Connect to the cljs repl and
eval is works as expected.

