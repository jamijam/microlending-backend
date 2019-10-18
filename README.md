# Micro-Lending Backend for Credit Insight

This backend is required for Encryption and Decryption functionalities in `Trusting Social - Credit Insight` API integration.

## Setting up the backend server

1.  Download the code into IDE instance

        git clone https://github.com/apixplatform/microlending-backend.git

2.  Backend code is downloaded to IDE instance to the folder `microlending-backend`. Let's change the terminal directory to `microlending-backend` folder.

        cd microlending-backend/

3. Start the backend server

        sh deploy.sh

## Pointing frontend use cases to the backend server

1. Copy the Backend IDE instance URL from the browser tab. (ex: `https://ide-xxxxxx.services.apixplatform.com`)

2. Change the `ide` text to `app` in the URL and open. New URL would look like (ex: `https://app-xxxxxx.services.apixplatform.com`)

3. Update `api-config.json` in frontend code with the backend app URL.

        "encDecUtil" : {
                "url": {
                "base": "https://app-xxxxxx.services.apixplatform.com",
                "encryptEndpoint": "https://app-xxxxxx.services.apixplatform.com/encrypt",
                "decryptEndpoint": "https://app-xxxxxx.services.apixplatform.com/decrypt"
                }
        },
