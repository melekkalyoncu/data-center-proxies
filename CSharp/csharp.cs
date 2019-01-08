using System;
using System.Net;

class Example
{
    static void Main()
    {
        var client = new WebClient();
        client.Proxy = new WebProxy("1.1.1.1:60000");
        client.Proxy.Credentials = new NetworkCredential("username", "pass");
        Console.WriteLine(client.DownloadString("https://ifconfig.co/ip"));
    }
}
