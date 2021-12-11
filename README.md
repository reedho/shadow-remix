# ShadowCljs <3 Remix

The first commit (tagged as `basis`) contains minimalist proof of concept how
component created with cljs can be integrated into remix environment.

Here is the step by step guide, assumed you're using linux.

```
git clone https://github.com/reedho/shadow-remix
cd shadow-remix
git checkout tags/basis
npm install
npx shadow-cljs release rmx
npx remix watch    # leave this running, use new terminal for running next commands
npm run start
xdg-open http://localhost:8787
```

Contribution, suggestion etc are very much welcome. The goal is to have the best
experience creating remix-app with ClojureSCript and ShadowCljs.


# Welcome to Remix!

- [Remix Docs](https://remix.run/docs)

## Development

You will be running two processes during development:

- The Miniflare server (miniflare is a local environment for Cloudflare Workers)
- The Remix development server

```sh
# in one tab, start the remix dev server
$ npm run dev

# in another, start the miniflare server
$ npm start
```

Open up [http://127.0.0.1:8787](http://127.0.0.1:8787) and you should be ready to go!

If you'd rather run everything in a single tab, you can look at [concurrently](https://npm.im/concurrently) or similar tools to run both processes in one tab.

## Deployment

Use [wrangler](https://developers.cloudflare.com/workers/cli-wrangler) to build and deploy your application to Cloudflare Workers. If you don't have it yet, follow [the installation guide](https://developers.cloudflare.com/workers/cli-wrangler/install-update) to get it setup. Be sure to [authenticate the CLI](https://developers.cloudflare.com/workers/cli-wrangler/authentication) as well.

Once that's done, you should be able to deploy your app:

```sh
npm run deploy
```
