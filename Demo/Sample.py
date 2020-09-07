from threading import *
from time import *

from selenium import webdriver
from selenium.webdriver import DesiredCapabilities
from selenium.webdriver.common.by import By

from webdriver_manager.firefox import GeckoDriverManager

class CrossBrowserTest:
    def openAplication(self, brName):
        self.browser = webdriver.Firefox(executable_path=GeckoDriverManager().install())
        self.browser.get('https://opensource-demo.orangehrmlive.com/')
        print("Application opened")

    def login(self):
        self.browser.find_element(By.ID, 'txtUsername').send_keys("admin")
        self.browser.find_element(By.ID, 'txtPassword').send_keys("admin123")
        self.browser.find_element(By.ID, 'btnLogin').click()
        print('login successful')

    def addEmp(self):
        sleep(1)
        self.browser.find_element(By.LINK_TEXT, 'PIM').click()
        self.browser.find_element(By.LINK_TEXT, 'Add Employee').click()
        print('add employee displayed')

    def closeApp(self):
        self.browser.quit()
        print('application closed')


def run(br):
    cb = CrossBrowserTest()
    cb.openAplication(brName=br)
    cb.login()
    cb.addEmp()
    cb.closeApp()
    del cb


t1 =Thread(target=run,args=('firefox',))
t2 =Thread(target=run,args=('firefox',))

t2.start()
t1.start()
