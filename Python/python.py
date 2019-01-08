#!/usr/bin/env python
 print('If you get error "ImportError: No module named six" install six: $ sudo pip install six');
 import sys
 if sys.version_info[0]==2:
    import six
    from six.moves.urllib import request
    opener = request.build_opener(
        request.ProxyHandler(
            {'http': 'http://username:pass@1.1.1.1:60000',
             'https': 'http://username:pass@1.1.1.1:60000'}))
    print(opener.open('https://ifconfig.co/ip').read())
 if sys.version_info[0]==3:
    import urllib.request
    opener = urllib.request.build_opener(
        urllib.request.ProxyHandler(
            {'http': 'http://username:pass@1.1.1.1:60000',
             'https': 'http://username:pass@1.1.1.1:60000'}))
    print(opener.open('https://ifconfig.co/ip').read())
