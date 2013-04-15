# A sample Guardfile
# More info at https://github.com/guard/guard#readme

def compile_and_test
  system 'rm -rf classes/*'
  system 'javac -classpath junit-4.11.jar:hamcrest-core-1.3.jar -d classes prime/*.java'
  if $?.exitstatus != 0
    [false, "failed to compile"]
  else
    system 'java -classpath junit-4.11.jar:hamcrest-core-1.3.jar:classes org.junit.runner.JUnitCore prime.TestPrime'
    if $?.exitstatus != 0
      [false, "failed to run"]
    else
      [true, "yay"]
    end
  end
end

guard :shell, :all_on_start => true do
  watch(/^prime\/.+\.java/) do |m|
    outcome, message = compile_and_test
    if outcome
      n m[0], message, :success
    else
      n m[0], message, :failure
    end
  end
end
