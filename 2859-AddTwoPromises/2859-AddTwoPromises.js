// Last updated: 7/9/2026, 9:46:48 AM
/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
      const[a,b]=await Promise.all([promise1, promise2]);
      return a+b;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */