# payment-icon-sdk

![GitHub](https://img.shields.io/github/license/cashfree/payments-icons-java)
![GitHub last commit (branch)](https://img.shields.io/github/last-commit/cashfree/payments-icons-java/master)
![GitHub forks](https://img.shields.io/github/forks/cashfree/payments-icons-java)
![GitHub Repo stars](https://img.shields.io/github/stars/cashfree/payments-icons-java)


Payment Icon SDK allows you to fetch payment icon into your application.

## Video
![Search By Bank Names](https://github.com/cashfree/payments-icons-java/blob/master/sample/PaymentIcons_search.gif)
![Search By Modes](https://github.com/cashfree/payments-icons-java/blob/master/sample/PaymentIcons_modes.gif)

## Usage

```js
/*
Supported Size:
sm : "32*32",
md : "64*64",
lg : "128*128",
svg: "svg"
*/

/*
To Fetch icon by modes.
[CARD_BANK, CARD_SCHEME, PAYLATER, UPI, WALLET, CARDLESS]
*/
PaymentIcons.getModesLogo(IconModes.CARD_BANK, "sm")
/*
To Fetch single icon by bank nic name
*/
PaymentIcons.getLogo("sbi", "sm")

/*
To Fetch multiple icons by banks nick names
*/
ArrayList<String> nicks = new ArrayList<String>(Arrays.asList("sbi", "pnb", "axis"));
PaymentIcons.getLogos(Arrays.asList(nicks), "sm")

```


## License
<pre>
Cashfree Payment Icon SDK is licensed under the MIT License.
See the LICENSE file distributed with this work for additional
information regarding copyright ownership.

Except as contained in the LICENSE file, the name(s) of the above copyright
holders shall not be used in advertising or otherwise to promote the sale,
use or other dealings in this Software without prior written authorization.
</pre>
