# Micro-Lending Backend for Credit Insight

This backend is required for Encryption and Decryption functionalities in `Trusting Social - Credit Insight` API integration.

## 1. Setting up the backend server

        sh deploy.sh

## 2. Pointing frontend use cases to the backend server

2.1. Copy the Backend IDE instance URL from the browser tab. (ex: `https://ide-xxxxxx.services.apixplatform.com`)

2.2. Change the `ide` text to `app` in the URL and open. New URL would look like (ex: `https://app-xxxxxx.services.apixplatform.com`)

2.3. Update `api-config.json` in frontend code with the backend app URL.

        "encDecUtil" : {
                "url": {
                "base": "https://app-xxxxxx.services.apixplatform.com",
                "encryptEndpoint": "https://app-xxxxxx.services.apixplatform.com/encrypt",
                "decryptEndpoint": "https://app-xxxxxx.services.apixplatform.com/decrypt"
                }
        },
