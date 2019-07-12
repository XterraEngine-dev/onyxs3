# ONYX S3
## UPLOAD TO AMAZON S3 BUCKET


### Dependencia

#### project app
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
#### module app

```
dependencies {
    implementation 'com.github.XterraEngine-dev:onyxs3:0.0.1'
	}
```

### Uso 
```
new Onyxamazon(this, 
new S3Cert().onyxCert(this,YOUR_SECRET,YOUR_KEY), 
new BitmapToUri().getImageUri(this,YOUR_BITMAP))
.uploadImage(YOUR_APP_NAME,YOUR_USER, YOUR_SERVICE);
```


The MIT License

Copyright (c) 2010-2019 Xterra Engine, Inc. https://xterra-engine.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.