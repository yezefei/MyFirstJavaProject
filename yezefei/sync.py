class Sync(object):
    def __init__(self,name):
        self.name = name
    
    def run(self):
        print("%s is running..."%self.name)


def main():
    a = Sync("uzi")
    a.run()

if __name__ == '__main__':
    main()

    