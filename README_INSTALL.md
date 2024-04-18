# Para criar o executavél com o maven adicionar as dependencias no pomXml
## Certifique-se de que o seu arquivo pom.xml está configurado corretamente. Você precisará adicionar plugins que ajudarão a empacotar seu aplicativo corretamente.
## Substitua com.seu_pacote.MainClass pelo pacote e classe principal do seu programa.

## Empacotar o aplicativo: Execute o comando Maven para empacotar o aplicativo:
 **mvn clean package**

## Executável JAR: Agora, você pode executar o JAR gerado em qualquer computador que tenha o Java instalado:
 **java -jar seu-aplicativo.jar**
<build>
    <plugins>
        <!-- Plugin for building an executable JAR -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-assembly-plugin</artifactId>
            <version>3.3.0</version>
            <configuration>
                <descriptorRefs>
                    <descriptorRef>jar-with-dependencies</descriptorRef>
                </descriptorRefs>
                <archive>
                    <manifest>
                        <mainClass>com.seu_pacote.MainClass</mainClass>
                    </manifest>
                </archive>
            </configuration>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals>
                        <goal>single</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>

## Com o JavaFX, você pode criar uma aplicação desktop com uma interface gráfica mais rica e também empacotá-la de forma mais conveniente para distribuição em diferentes plataformas. Aqui está um exemplo básico de como você pode empacotar sua aplicação JavaFX em um executável usando o Maven:

## Configurar o Maven: Primeiro, você precisa garantir que o seu arquivo pom.xml esteja configurado corretamente para empacotar o seu aplicativo JavaFX. Você precisará adicionar o plugin maven-assembly-plugin ou maven-shade-plugin para empacotar todas as dependências, bem como o plugin javafx-maven-plugin para criar o executável.

## Empacotar o aplicativo: Execute o comando Maven para empacotar o aplicativo, incluindo as dependências:

**mvn clean package**
<build>
    <plugins>
        <!-- Plugin for building an executable JAR -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-assembly-plugin</artifactId>
            <version>3.3.0</version>
            <configuration>
                <descriptorRefs>
                    <descriptorRef>jar-with-dependencies</descriptorRef>
                </descriptorRefs>
                <archive>
                    <manifest>
                        <mainClass>com.seu_pacote.MainClass</mainClass>
                    </manifest>
                </archive>
            </configuration>
            <executions>
                <execution>
                    <phase>package</phase>
                    <goals>
                        <goal>single</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
        <!-- Plugin for JavaFX -->
        <plugin>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-maven-plugin</artifactId>
            <version>0.0.8</version>
            <configuration>
                <mainClass>com.seu_pacote.MainClass</mainClass>
            </configuration>
        </plugin>
    </plugins>
</build>


## Este comando criará um arquivo JAR na pasta target do seu projeto.

## Criar um executável nativo: Com o plugin javafx-maven-plugin, você pode criar um executável nativo para diferentes plataformas. Execute o seguinte comando para gerar o executável:
**mvn javafx:compile
  mvn javafx:run**