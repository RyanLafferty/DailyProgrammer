input = []
input += ['button_clicked']
input += ['cycle_complete']
input += ['button_clicked']
input += ['button_clicked']
input += ['button_clicked']
input += ['button_clicked']
input += ['button_clicked']
input += ['cycle_complete']

doorState = 0
#states
#0 = Closed
#1 = Opening
#2 = Stopped while opening
#3 = Open
#4 = Closing
#5 = Stopped while closing

print 'Door Closed'
print ' '
for action in input:
    print '>' + action
    if action == 'button_clicked':
        if doorState == 0:
            print 'Door Opening'
            doorState = 1
        elif doorState == 1:
            print 'Door Stopped While Opening'
            doorState = 2
        elif doorState == 2:
            print 'Door Closing'
            doorState = 4
        elif doorState == 3:
            print 'Door Closing'
            doorState = 4
        elif doorState == 4:
            print 'Door Stopped While Closing'
            doorState = 5
        elif doorState == 5:
            print 'Door Opening'
            doorState = 1
    elif action == 'cycle_complete':
        if doorState == 1:
            print 'Door Opened'
            doorState = 3
        elif doorState == 4:
            print 'Door Closed'
            doorState = 0
    print ' '
