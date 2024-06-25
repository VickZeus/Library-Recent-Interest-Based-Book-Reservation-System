import csv
try:
    import mysql.connector as q 
except :
    import subprocess
    subprocess.run(['pip', 'install', 'mysql-connector-python'])

# Main function
def main():
    import mysql.connector as q 
    try:
        import mysql.connector as q 
        d = q.connect(host="localhost", user="root", password="abhishek@1604", database="bookrecord")
        conn = d.cursor()
        
        with open('X:\JAVA-LIB SDI APPLICATION\JAVLIB\SQL_Database_Builder_Files\Student.csv', 'r', newline='') as file:
            reader = csv.reader(file)
            i = 0
            for row in reader:
                if i != 0:
                    print(row)
                    print(row[0], row[1])
                    conn.execute("INSERT INTO studentdetails(studentid,g1,g2,g3,studentname,issue,returns,fine) VALUES (%s, %s, %s, %s, %s, %s, %s, %s)", (row[0],None,None,None, row[1],None,None,0))
                    d.commit()
                i += 1
        
        print("Data copied from CSV to MySQL database successfully.")
        conn.close() 
    except Exception as e:
        print("An error occurred:", e)

if __name__ == "__main__":
    main()
